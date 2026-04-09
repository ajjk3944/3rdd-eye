.class public final synthetic Lfb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# instance fields
.field public final synthetic a:Lfb/k;


# direct methods
.method public synthetic constructor <init>(Lfb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb/f;->a:Lfb/k;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lfb/f;->a:Lfb/k;

    invoke-static {v0}, Lfb/k;->t(Lfb/k;)Lfb/n;

    move-result-object v0

    return-object v0
.end method
