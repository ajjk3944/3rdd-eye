.class public final LM8/r$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/r;->s(Ljava/util/List;La8/a;Ljava/util/Map;Lic/a;LS8/c;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, LM8/a;

    invoke-virtual {p1}, LM8/a;->a()LCc/a$b;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, LCc/a;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    check-cast p2, LM8/a;

    invoke-virtual {p2}, LM8/a;->a()LCc/a$b;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2}, LCc/a;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-static {p1, v0}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
