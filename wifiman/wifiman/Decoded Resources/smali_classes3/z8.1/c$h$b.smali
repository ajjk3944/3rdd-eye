.class public final Lz8/c$h$b;
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
.field final synthetic a:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    iput-object p1, p0, Lz8/c$h$b;->a:Ljava/util/Comparator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lz8/c$h$b;->a:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, LTe/e0;

    invoke-virtual {p1}, LTe/e0;->f()Lh9/a;

    move-result-object p1

    check-cast p2, LTe/e0;

    invoke-virtual {p2}, LTe/e0;->f()Lh9/a;

    move-result-object p2

    invoke-static {p1, p2}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result v0

    :goto_0
    return v0
.end method
