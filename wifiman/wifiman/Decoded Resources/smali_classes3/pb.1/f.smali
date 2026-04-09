.class public final synthetic Lpb/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lpb/l;


# direct methods
.method public synthetic constructor <init>(Lpb/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpb/f;->a:Lpb/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lpb/f;->a:Lpb/l;

    invoke-static {v0}, Lpb/l;->d(Lpb/l;)V

    return-void
.end method
