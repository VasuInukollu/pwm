/*
 * Password Management Servlets (PWM)
 * http://www.pwm-project.org
 *
 * Copyright (c) 2006-2009 Novell, Inc.
 * Copyright (c) 2009-2016 The PWM Project
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package password.pwm.cr;

import java.io.Serializable;

public class CrChallengeItemBean implements Serializable {
    public String challengeText;
    public int minLength;
    public int maxLength;
    public boolean adminDefined;
    public boolean required;
    public int maxQuestionCharsInAnswer;
    public boolean enforceWordlist;

    public CrChallengeItemBean(String challengeText, int minLength, int maxLength, boolean adminDefined, boolean required, int maxQuestionCharsInAnswer, boolean enforceWordlist) {
        this.challengeText = challengeText;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.adminDefined = adminDefined;
        this.required = required;
        this.maxQuestionCharsInAnswer = maxQuestionCharsInAnswer;
        this.enforceWordlist = enforceWordlist;
    }

    public String getChallengeText() {
        return challengeText;
    }

    public int getMinLength() {
        return minLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public boolean isAdminDefined() {
        return adminDefined;
    }

    public boolean isRequired() {
        return required;
    }

    public int getMaxQuestionCharsInAnswer() {
        return maxQuestionCharsInAnswer;
    }

    public boolean isEnforceWordlist() {
        return enforceWordlist;
    }
}
