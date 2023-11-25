package lotto.domain;

public class LottoCountSummary {
    private final ManualLottoCount manulLottoCount;
    private final LottoCount autoLottoCount;

    public LottoCountSummary(ManualLottoCount manulLottoCount, LottoCount autoLottoCount) {
        this.manulLottoCount = manulLottoCount;
        this.autoLottoCount = autoLottoCount;
    }

    public static LottoCountSummary of(LottoCount totalLottoCount, ManualLottoCount manulLottoCount) {
//        int totalLottoCount = purchaseAmount.calculateLottoCount();
//        int autoLottoCount = manulLottoCount.calculateAutoLottoCountByTotalCount(totalLottoCount);
        int autoLottoCount = manulLottoCount.calculateAutoLottoCountByTotalCount(totalLottoCount);
        return new LottoCountSummary(manulLottoCount, LottoCount.from(autoLottoCount));
    }

    public static LottoCountSummary of(int manulLottoCount, int autoLottoCount) {
        return new LottoCountSummary(ManualLottoCount.from(manulLottoCount), LottoCount.from(autoLottoCount));
    }

    public boolean isLessThanAutoLottoCount(int presentLottoCount) {
        return autoLottoCount.isCountGreaterThan(presentLottoCount);
    }

    public ManualLottoCount getManulLottoCount() {
        return manulLottoCount;
    }

    public LottoCount getAutoLottoCount() {
        return autoLottoCount;
    }
}
