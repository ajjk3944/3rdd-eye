.class public final Lw/w;
.super Landroidx/compose/ui/e$c;
.source "SourceFile"

# interfaces
.implements LE0/A0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/w$a;
    }
.end annotation


# static fields
.field public static final p:Lw/w$a;

.field public static final q:I


# instance fields
.field private final n:Ljava/lang/Object;

.field private o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw/w$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw/w$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lw/w;->p:Lw/w$a;

    const/16 v0, 0x8

    sput v0, Lw/w;->q:I

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    sget-object v0, Lw/w;->p:Lw/w$a;

    iput-object v0, p0, Lw/w;->n:Ljava/lang/Object;

    iput-boolean p1, p0, Lw/w;->o:Z

    return-void
.end method


# virtual methods
.method public final D2()Z
    .locals 1

    iget-boolean v0, p0, Lw/w;->o:Z

    return v0
.end method

.method public final E2(Z)V
    .locals 0

    iput-boolean p1, p0, Lw/w;->o:Z

    return-void
.end method

.method public W()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw/w;->n:Ljava/lang/Object;

    return-object v0
.end method
