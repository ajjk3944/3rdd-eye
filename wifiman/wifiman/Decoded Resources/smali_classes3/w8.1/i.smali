.class public final synthetic Lw8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lw8/t;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lw8/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw8/i;->a:Ljava/lang/String;

    iput-object p2, p0, Lw8/i;->b:Lw8/t;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lw8/i;->a:Ljava/lang/String;

    iget-object v1, p0, Lw8/i;->b:Lw8/t;

    check-cast p1, Lcom/ubnt/usurvey/a;

    invoke-static {v0, v1, p1}, Lw8/t;->X0(Ljava/lang/String;Lw8/t;Lcom/ubnt/usurvey/a;)Lcom/ubnt/usurvey/a;

    move-result-object p1

    return-object p1
.end method
