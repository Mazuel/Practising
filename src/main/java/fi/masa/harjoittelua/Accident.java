package fi.masa.harjoittelua;

import java.util.ArrayList;
import java.util.List;

public class Accident {
    public class AccidentActionService {
        public Accident saveAccidentLesson(Accident entity, AccidentLesson selectedAccidentLesson, String saveDelete) {
            List<AccidentLesson> tmpAccidentLessons = entity.getAccidentLessons();
            if (tmpAccidentLessons != null && tmpAccidentLessons.size() > 0 && selectedAccidentLesson != null
                    && selectedAccidentLesson.getId() > 0) {
                int iSelected = 0;
                for (AccidentLesson accidentLesson : tmpAccidentLessons) {
                    if (selectedAccidentLesson.getId() == accidentLesson.getId()) {
                        if (saveDelete.equalsIgnoreCase("save")) {
                            tmpAccidentLessons.set(iSelected, selectedAccidentLesson);
                        } else if (saveDelete.equalsIgnoreCase("delete")) {
                            tmpAccidentLessons.remove(iSelected);
                        }
                        entity.setAccidentLessons(tmpAccidentLessons);
                        break;
                    }
                    iSelected++;
                }
                return entity;
            } else {
                if (saveDelete.equalsIgnoreCase("save")) {
                    if (tmpAccidentLessons == null) {
                        tmpAccidentLessons = new ArrayList<AccidentLesson>();
                    }
                    tmpAccidentLessons.add(selectedAccidentLesson);
                    entity.setAccidentLessons(tmpAccidentLessons);
                }
            }
            return entity;
        }

    }

    public List<AccidentLesson> getAccidentLessons() {
        // TODO Auto-generated method stub
        return null;
    }

    public void setAccidentLessons(List<AccidentLesson> tmpAccidentLessons) {
        // TODO Auto-generated method stub
        
    }
}
