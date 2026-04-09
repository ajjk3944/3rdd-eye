.class public abstract Lfh/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a([Ljava/lang/Enum;)Lfh/a;
    .locals 1

    const-string v0, "entries"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfh/c;

    invoke-direct {v0, p0}, Lfh/c;-><init>([Ljava/lang/Enum;)V

    return-object v0
.end method
