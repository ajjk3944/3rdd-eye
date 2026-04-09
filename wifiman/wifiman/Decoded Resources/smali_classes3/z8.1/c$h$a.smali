.class public final Lz8/c$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz8/c$h;->b(Ljava/util/Set;Ljava/util/Set;Ljava/util/Map;La8/a;Ll9/a;Ljava/lang/Boolean;)Lz8/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LS8/c;


# direct methods
.method public constructor <init>(LS8/c;)V
    .locals 0

    iput-object p1, p0, Lz8/c$h$a;->a:LS8/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    check-cast p1, LTe/e0;

    invoke-virtual {p1}, LTe/e0;->a()LS8/c;

    move-result-object p1

    iget-object v0, p0, Lz8/c$h$a;->a:LS8/c;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast p2, LTe/e0;

    invoke-virtual {p2}, LTe/e0;->a()LS8/c;

    move-result-object p2

    iget-object v0, p0, Lz8/c$h$a;->a:LS8/c;

    if-ne p2, v0, :cond_1

    move v1, v2

    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p1, p2}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
