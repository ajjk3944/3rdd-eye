.class public final LM8/A$g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM8/A$g;->h(LM8/A$b$c;Lde/E;Ljava/lang/Boolean;)LEe/g;
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
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lie/c;

    invoke-virtual {p1}, Lie/c;->a()LS8/e;

    move-result-object p1

    invoke-virtual {p1}, LS8/e;->a()LS8/c;

    move-result-object p1

    check-cast p2, Ljava/util/List;

    invoke-static {p2}, LZg/v;->q0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lie/c;

    invoke-virtual {p2}, Lie/c;->a()LS8/e;

    move-result-object p2

    invoke-virtual {p2}, LS8/e;->a()LS8/c;

    move-result-object p2

    invoke-static {p1, p2}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
