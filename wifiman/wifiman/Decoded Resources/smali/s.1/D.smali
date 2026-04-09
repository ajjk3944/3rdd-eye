.class public final Ls/D;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/A0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls/D$a;
    }
.end annotation


# static fields
.field public static final p:Ls/D$a;

.field public static final q:I


# instance fields
.field private n:Lmh/l;

.field private final o:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls/D$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls/D$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ls/D;->p:Ls/D$a;

    const/16 v0, 0x8

    sput v0, Ls/D;->q:I

    return-void
.end method

.method public constructor <init>(Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    iput-object p1, p0, Ls/D;->n:Lmh/l;

    sget-object p1, Ls/D;->p:Ls/D$a;

    iput-object p1, p0, Ls/D;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final D2(LC0/r;)V
    .locals 1

    iget-object v0, p0, Ls/D;->n:Lmh/l;

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, LE0/B0;->b(LE0/A0;)LE0/A0;

    move-result-object v0

    check-cast v0, Ls/D;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ls/D;->D2(LC0/r;)V

    :cond_0
    return-void
.end method

.method public W()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls/D;->o:Ljava/lang/Object;

    return-object v0
.end method
