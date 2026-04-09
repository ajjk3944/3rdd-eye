.class public final synthetic Lme/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lme/e;


# direct methods
.method public synthetic constructor <init>(Lme/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lme/d;->a:Lme/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lme/d;->a:Lme/e;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lme/e;->d(Lme/e;Ljava/lang/String;)Lme/e$a;

    move-result-object p1

    return-object p1
.end method
