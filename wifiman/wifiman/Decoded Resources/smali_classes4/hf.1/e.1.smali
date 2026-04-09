.class public final synthetic Lhf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lhf/K;

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(Lhf/K;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhf/e;->a:Lhf/K;

    iput p2, p0, Lhf/e;->b:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhf/e;->a:Lhf/K;

    iget v1, p0, Lhf/e;->b:F

    check-cast p1, Lo0/f;

    invoke-static {v0, v1, p1}, Lhf/g;->a(Lhf/K;FLo0/f;)LYg/J;

    move-result-object p1

    return-object p1
.end method
