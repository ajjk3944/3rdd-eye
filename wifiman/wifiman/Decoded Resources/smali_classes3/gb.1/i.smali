.class public final synthetic Lgb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lgb/k;


# direct methods
.method public synthetic constructor <init>(Lgb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgb/i;->a:Lgb/k;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lgb/i;->a:Lgb/k;

    invoke-static {v0}, Lgb/k;->b(Lgb/k;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
