package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double averageScore = 0;
        int index = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                averageScore = averageScore + subject.score();
                index++;
            }
        }
        return averageScore / index;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double averageScore = 0;
            int index = 0;
            for (Subject subject : pupil.subjects()) {
                averageScore = averageScore + subject.score();
                index++;
            }
            Label label = new Label(pupil.name(), averageScore / index);
            list.add(label);
        }
        return list;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> subjects = new HashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                subjects.put(subject.name(), subjects.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        List<Label> averageSubject = new ArrayList<>();
        double amount = pupils.size();
        for (Map.Entry<String, Integer> entry : subjects.entrySet()) {
            averageSubject.add(new Label(entry.getKey(), entry.getValue() / amount));
        }
        return averageSubject;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double averageScore = 0;
            for (Subject subject : pupil.subjects()) {
                averageScore = averageScore + subject.score();
            }
            Label label = new Label(pupil.name(), averageScore);
            list.add(label);
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> mapSubject = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                mapSubject.put(subject.name(), mapSubject.getOrDefault(subject.name(), 0) + subject.score());
               }
            }
        TreeSet<Label> bestSubjects = new TreeSet<>();
            for (Map.Entry<String, Integer> entry : mapSubject.entrySet()) {
                bestSubjects.add(new Label(entry.getKey(), entry.getValue()));
            }
        return bestSubjects.last();
    }
}