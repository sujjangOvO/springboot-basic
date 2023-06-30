package com.prgms.voucher.voucherproject.domain;

import java.util.UUID;

public class FixedAmountVoucher implements Voucher {
    private final UUID voucherId;
    private final long amount;

    public FixedAmountVoucher(UUID voucherId, long amount) {
        this.amount = amount;
        this.voucherId = voucherId;
    }

    @Override
    public UUID getId() {
        return voucherId;
    }

    public long discount(long beforeDiscount) {
        return beforeDiscount - amount;
    }

    @Override
    public String toString() {
        return "| UUID:" + getId() + "  | VoucherType: FixedVoucher | amount:" + amount + " |";
    }


}
