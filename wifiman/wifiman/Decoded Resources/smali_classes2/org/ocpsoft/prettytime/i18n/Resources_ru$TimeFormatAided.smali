.class Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAj/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/ocpsoft/prettytime/i18n/Resources_ru;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TimeFormatAided"
.end annotation


# instance fields
.field private final a:[Ljava/lang/String;

.field final synthetic b:Lorg/ocpsoft/prettytime/i18n/Resources_ru;


# direct methods
.method public varargs constructor <init>(Lorg/ocpsoft/prettytime/i18n/Resources_ru;[Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;->b:Lorg/ocpsoft/prettytime/i18n/Resources_ru;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length p1, p2

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iput-object p2, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;->a:[Ljava/lang/String;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    array-length v1, p2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {v0, v1, p2}, [Ljava/lang/Object;

    move-result-object p2

    const-string v0, "Wrong plural forms number for russian language! Expected %s, got %s\nPlurals: %s"

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(LAj/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;->e(LAj/a;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p2, 0x32

    invoke-interface {p1, p2}, LAj/a;->d(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const/4 p2, 0x0

    invoke-virtual {p0, v0, v1, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;->d(JZ)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;->c(LAj/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;->c(LAj/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b(LAj/a;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x32

    invoke-interface {p1, v0}, LAj/a;->d(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const/4 p1, 0x1

    invoke-virtual {p0, v0, v1, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;->d(JZ)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public c(LAj/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-interface {p1}, LAj/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "\u0447\u0435\u0440\u0435\u0437 "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-interface {p1}, LAj/a;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " \u043d\u0430\u0437\u0430\u0434"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    return-object p2
.end method

.method public d(JZ)Ljava/lang/String;
    .locals 11

    const-wide/16 v0, 0xa

    rem-long v2, p1, v0

    const-wide/16 v4, 0x1

    cmp-long v4, v2, v4

    const-wide/16 v5, 0x64

    if-nez v4, :cond_0

    rem-long v7, p1, v5

    const-wide/16 v9, 0xb

    cmp-long v4, v7, v9

    if-eqz v4, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v7, 0x2

    cmp-long v4, v2, v7

    if-ltz v4, :cond_2

    const-wide/16 v7, 0x4

    cmp-long v2, v2, v7

    if-gtz v2, :cond_2

    rem-long v2, p1, v5

    cmp-long v0, v2, v0

    if-ltz v0, :cond_1

    const-wide/16 v0, 0x14

    cmp-long v0, v2, v0

    if-ltz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    :goto_0
    const/4 v1, 0x4

    if-gt v0, v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;->a:[Ljava/lang/String;

    if-eqz p3, :cond_3

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    :goto_1
    aget-object p1, p1, v0

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Wrong plural index was calculated somehow for russian language"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(LAj/a;Z)Z
    .locals 2

    if-eqz p2, :cond_0

    const/16 p2, 0x32

    invoke-interface {p1, p2}, LAj/a;->d(I)J

    move-result-wide p1

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    goto :goto_1

    :cond_0
    invoke-interface {p1}, LAj/a;->c()J

    move-result-wide p1

    goto :goto_0

    :goto_1
    const-wide/16 v0, 0x1

    cmp-long p1, p1, v0

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    :goto_2
    return p1
.end method
