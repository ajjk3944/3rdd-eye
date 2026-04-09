.class final LB/f;
.super Ljava/util/concurrent/CancellationException;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Lr/k;


# direct methods
.method public constructor <init>(ILr/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/CancellationException;-><init>()V

    iput p1, p0, LB/f;->a:I

    iput-object p2, p0, LB/f;->b:Lr/k;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LB/f;->a:I

    return v0
.end method

.method public final c()Lr/k;
    .locals 1

    iget-object v0, p0, LB/f;->b:Lr/k;

    return-object v0
.end method
