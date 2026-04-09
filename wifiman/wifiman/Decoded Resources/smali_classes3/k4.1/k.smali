.class public final synthetic Lk4/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final synthetic a:Lk4/t;


# direct methods
.method public synthetic constructor <init>(Lk4/t;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk4/k;->a:Lk4/t;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 1

    iget-object v0, p0, Lk4/k;->a:Lk4/t;

    invoke-static {v0}, Lk4/t;->j(Lk4/t;)V

    return-void
.end method
