.class public abstract LF1/j0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF1/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field a:Landroid/view/WindowInsets;

.field private final b:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LF1/j0$b;->b:I

    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    iget v0, p0, LF1/j0$b;->b:I

    return v0
.end method

.method public c(LF1/j0;)V
    .locals 0

    return-void
.end method

.method public d(LF1/j0;)V
    .locals 0

    return-void
.end method

.method public abstract e(LF1/w0;Ljava/util/List;)LF1/w0;
.end method

.method public f(LF1/j0;LF1/j0$a;)LF1/j0$a;
    .locals 0

    return-object p2
.end method
