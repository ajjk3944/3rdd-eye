.class public final synthetic Lv7/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lv7/j;


# direct methods
.method public synthetic constructor <init>(Lv7/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/i;->a:Lv7/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lv7/i;->a:Lv7/j;

    invoke-static {v0}, Lv7/j;->d(Lv7/j;)V

    return-void
.end method
