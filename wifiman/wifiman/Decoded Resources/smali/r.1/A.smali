.class final Lr/A;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr/z;


# instance fields
.field private final a:Lr/J;


# direct methods
.method public constructor <init>(Lr/J;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/A;->a:Lr/J;

    return-void
.end method


# virtual methods
.method public a(Lr/s0;)Lr/x0;
    .locals 1

    new-instance p1, Lr/B0;

    iget-object v0, p0, Lr/A;->a:Lr/J;

    invoke-direct {p1, v0}, Lr/B0;-><init>(Lr/J;)V

    return-object p1
.end method
