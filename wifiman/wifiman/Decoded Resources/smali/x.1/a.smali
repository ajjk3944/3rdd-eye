.class final Lx/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lr/k;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lr/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx/a;->a:Ljava/lang/Object;

    iput-object p2, p0, Lx/a;->b:Lr/k;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lx/a;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final b()Lr/k;
    .locals 1

    iget-object v0, p0, Lx/a;->b:Lr/k;

    return-object v0
.end method

.method public final c()Lr/k;
    .locals 1

    iget-object v0, p0, Lx/a;->b:Lr/k;

    return-object v0
.end method
