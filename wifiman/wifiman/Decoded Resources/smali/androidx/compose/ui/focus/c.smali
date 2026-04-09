.class final Landroidx/compose/ui/focus/c;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements Lk0/b;


# instance fields
.field private n:Lmh/l;

.field private o:Lk0/l;


# direct methods
.method public constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/ui/focus/c;->n:Lmh/l;

    return-void
.end method


# virtual methods
.method public final D2(Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/focus/c;->n:Lmh/l;

    return-void
.end method

.method public J1(Lk0/l;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/focus/c;->o:Lk0/l;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/focus/c;->o:Lk0/l;

    iget-object v0, p0, Landroidx/compose/ui/focus/c;->n:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
