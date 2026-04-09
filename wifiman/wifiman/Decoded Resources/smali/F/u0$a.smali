.class final LF/u0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:LF/u0$a;

.field private b:LR0/Q;


# direct methods
.method public constructor <init>(LF/u0$a;LR0/Q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF/u0$a;->a:LF/u0$a;

    iput-object p2, p0, LF/u0$a;->b:LR0/Q;

    return-void
.end method


# virtual methods
.method public final a()LF/u0$a;
    .locals 1

    iget-object v0, p0, LF/u0$a;->a:LF/u0$a;

    return-object v0
.end method

.method public final b()LR0/Q;
    .locals 1

    iget-object v0, p0, LF/u0$a;->b:LR0/Q;

    return-object v0
.end method

.method public final c(LF/u0$a;)V
    .locals 0

    iput-object p1, p0, LF/u0$a;->a:LF/u0$a;

    return-void
.end method

.method public final d(LR0/Q;)V
    .locals 0

    iput-object p1, p0, LF/u0$a;->b:LR0/Q;

    return-void
.end method
