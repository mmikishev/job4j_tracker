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
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> list = new ArrayList<>();
        int index = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.put(subject.name(), subject.score());
            }
            index++;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Label label = new Label(entry.getKey(), (double) entry.getValue() / index);
            list.add(label);
        }
        return list;
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
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.put(subject.name(), subject.score());
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Label label = new Label(entry.getKey(), (double) entry.getValue());
            list.add(label);
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }
}