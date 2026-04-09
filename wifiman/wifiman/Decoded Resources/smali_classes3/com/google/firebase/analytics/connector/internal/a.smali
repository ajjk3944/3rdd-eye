.class public abstract Lcom/google/firebase/analytics/connector/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lcom/google/common/collect/r;

.field private static final b:Lcom/google/common/collect/o;

.field private static final c:Lcom/google/common/collect/o;

.field private static final d:Lcom/google/common/collect/o;

.field private static final e:Lcom/google/common/collect/o;

.field private static final f:Lcom/google/common/collect/o;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    const-string/jumbo v7, "_exp_timeout"

    const-string/jumbo v8, "_exp_expire"

    const-string/jumbo v0, "_ac"

    const-string/jumbo v1, "campaign_details"

    const-string/jumbo v2, "_ug"

    const-string/jumbo v3, "_iapx"

    const-string/jumbo v4, "_exp_set"

    const-string/jumbo v5, "_exp_clear"

    const-string/jumbo v6, "_exp_activate"

    filled-new-array/range {v0 .. v8}, [Ljava/lang/String;

    move-result-object v15

    const-string/jumbo v9, "_in"

    const-string/jumbo v10, "_xa"

    const-string/jumbo v11, "_xu"

    const-string/jumbo v12, "_aq"

    const-string/jumbo v13, "_aa"

    const-string/jumbo v14, "_ai"

    invoke-static/range {v9 .. v15}, Lcom/google/common/collect/r;->M0(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/google/common/collect/r;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/analytics/connector/internal/a;->a:Lcom/google/common/collect/r;

    const-string/jumbo v6, "_ui"

    const-string/jumbo v7, "_cd"

    const-string/jumbo v1, "_e"

    const-string/jumbo v2, "_f"

    const-string/jumbo v3, "_iap"

    const-string/jumbo v4, "_s"

    const-string/jumbo v5, "_au"

    invoke-static/range {v1 .. v7}, Lcom/google/common/collect/o;->K0(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/o;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/analytics/connector/internal/a;->b:Lcom/google/common/collect/o;

    const-string/jumbo v0, "app"

    const-string/jumbo v1, "am"

    const-string/jumbo v2, "auto"

    invoke-static {v2, v0, v1}, Lcom/google/common/collect/o;->q0(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/o;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/analytics/connector/internal/a;->c:Lcom/google/common/collect/o;

    const-string/jumbo v0, "_r"

    const-string/jumbo v1, "_dbg"

    invoke-static {v0, v1}, Lcom/google/common/collect/o;->b0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/o;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/analytics/connector/internal/a;->d:Lcom/google/common/collect/o;

    new-instance v0, Lcom/google/common/collect/o$a;

    invoke-direct {v0}, Lcom/google/common/collect/o$a;-><init>()V

    sget-object v1, Lcom/google/android/gms/measurement/internal/n4;->a:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/common/collect/o$a;->e([Ljava/lang/Object;)Lcom/google/common/collect/o$a;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/measurement/internal/n4;->b:[Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/common/collect/o$a;->e([Ljava/lang/Object;)Lcom/google/common/collect/o$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/o$a;->f()Lcom/google/common/collect/o;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/analytics/connector/internal/a;->e:Lcom/google/common/collect/o;

    const-string/jumbo v0, "^_ltv_[A-Z]{3}$"

    const-string/jumbo v1, "^_cc[1-5]{1}$"

    invoke-static {v0, v1}, Lcom/google/common/collect/o;->b0(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/o;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/analytics/connector/internal/a;->f:Lcom/google/common/collect/o;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/measurement/internal/l4;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p0
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    const-string/jumbo v0, "clx"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string/jumbo p0, "_ae"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string/jumbo p0, "_r"

    const-wide/16 v0, 0x1

    invoke-virtual {p2, p0, v0, v1}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 4

    sget-object v0, Lcom/google/firebase/analytics/connector/internal/a;->b:Lcom/google/common/collect/o;

    invoke-virtual {v0, p0}, Lcom/google/common/collect/o;->contains(Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_2

    sget-object p0, Lcom/google/firebase/analytics/connector/internal/a;->d:Lcom/google/common/collect/o;

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    move v2, v0

    :cond_1
    if-ge v2, v1, :cond_2

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    return v0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 5

    const/4 v0, 0x0

    const-string/jumbo v1, "_cmp"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x1

    if-nez p1, :cond_0

    return v1

    :cond_0
    invoke-static {p0}, Lcom/google/firebase/analytics/connector/internal/a;->f(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    return v0

    :cond_1
    if-nez p2, :cond_2

    return v0

    :cond_2
    sget-object p1, Lcom/google/firebase/analytics/connector/internal/a;->d:Lcom/google/common/collect/o;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    move v3, v0

    :cond_3
    if-ge v3, v2, :cond_4

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/2addr v3, v1

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p2, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    return v0

    :cond_4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    const-string/jumbo p1, "_cis"

    const/4 v2, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string/jumbo v3, "fiam"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1
    const-string/jumbo v3, "fdl"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_0

    :cond_6
    move v2, v1

    goto :goto_0

    :sswitch_2
    const-string/jumbo v3, "fcm"

    invoke-virtual {p0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_0

    :cond_7
    move v2, v0

    :goto_0
    packed-switch v2, :pswitch_data_0

    return v0

    :pswitch_0
    const-string/jumbo p0, "fiam_integration"

    invoke-virtual {p2, p1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :pswitch_1
    const-string/jumbo p0, "fdl_integration"

    invoke-virtual {p2, p1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :pswitch_2
    const-string/jumbo p0, "fcm_integration"

    invoke-virtual {p2, p1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :sswitch_data_0
    .sparse-switch
        0x18b50 -> :sswitch_2
        0x18b6e -> :sswitch_1
        0x2ff42f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lcom/google/firebase/analytics/connector/internal/a;->a:Lcom/google/common/collect/r;

    invoke-virtual {v0, p0}, Lcom/google/common/collect/n;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static f(Ljava/lang/String;)Z
    .locals 1

    sget-object v0, Lcom/google/firebase/analytics/connector/internal/a;->c:Lcom/google/common/collect/o;

    invoke-virtual {v0, p0}, Lcom/google/common/collect/o;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
