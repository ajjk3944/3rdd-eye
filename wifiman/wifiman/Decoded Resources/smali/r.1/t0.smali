.class final Lr/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/s0;


# instance fields
.field private final a:Lmh/l;

.field private final b:Lmh/l;


# direct methods
.method public constructor <init>(Lmh/l;Lmh/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/t0;->a:Lmh/l;

    iput-object p2, p0, Lr/t0;->b:Lmh/l;

    return-void
.end method


# virtual methods
.method public a()Lmh/l;
    .locals 1

    iget-object v0, p0, Lr/t0;->a:Lmh/l;

    return-object v0
.end method

.method public b()Lmh/l;
    .locals 1

    iget-object v0, p0, Lr/t0;->b:Lmh/l;

    return-object v0
.end method
