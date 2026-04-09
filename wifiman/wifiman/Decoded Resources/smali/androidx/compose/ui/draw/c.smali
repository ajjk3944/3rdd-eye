.class final Landroidx/compose/ui/draw/c;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/r;


# instance fields
.field private n:Lmh/l;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/draw/c;->n:Lmh/l;

    return-void
.end method


# virtual methods
.method public final D2(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/draw/c;->n:Lmh/l;

    return-void
.end method

.method public J(Lo0/c;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/draw/c;->n:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
