.class public final synthetic Lw8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lw8/t;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lw8/t;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/g;->a:Lw8/t;

    iput-object p2, p0, Lw8/g;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lw8/g;->a:Lw8/t;

    iget-object v1, p0, Lw8/g;->b:Ljava/lang/String;

    check-cast p1, Lcom/ubnt/usurvey/a;

    invoke-static {v0, v1, p1}, Lw8/t;->k1(Lw8/t;Ljava/lang/String;Lcom/ubnt/usurvey/a;)Lcom/ubnt/usurvey/a;

    move-result-object p1

    return-object p1
.end method
