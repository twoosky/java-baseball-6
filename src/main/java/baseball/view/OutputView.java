package baseball.view;


import static baseball.utils.ViewMessages.OUTPUT_DONE;
import static baseball.utils.ViewMessages.OUTPUT_START;

import baseball.dto.BaseballResultDto;
import java.text.MessageFormat;

public class OutputView {
    private OutputView() {
    }

    public static void printStart() {
        System.out.println(OUTPUT_START);
    }

    public static void printBaseballResult(BaseballResultDto dto) {
        String message = MessageFormat.format(dto.getMessageFormat(),
                dto.getBallCnt(), dto.getStrikeCnt());
        System.out.println(message);
    }

    public static void printDone() {
        System.out.println(OUTPUT_DONE);
    }

    public static void printErrorMessage(String message) {
        System.out.println(message);
    }
}
