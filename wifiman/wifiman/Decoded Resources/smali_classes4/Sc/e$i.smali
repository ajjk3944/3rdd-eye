.class public final LSc/e$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSc/e;->t(Ljava/util/Set;Ljava/util/Set;Lwa/a;Lt7/f;)Lxa/a$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LSc/e;


# direct methods
.method public constructor <init>(LSc/e;)V
    .locals 0

    iput-object p1, p0, LSc/e$i;->a:LSc/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p2, Lxa/a$d;

    iget-object v0, p0, LSc/e$i;->a:LSc/e;

    invoke-static {v0, p2}, LSc/e;->e(LSc/e;Lxa/a$d;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    check-cast p1, Lxa/a$d;

    iget-object v0, p0, LSc/e$i;->a:LSc/e;

    invoke-static {v0, p1}, LSc/e;->e(LSc/e;Lxa/a$d;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2, p1}, Lch/a;->e(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    move-result p1

    return p1
.end method
