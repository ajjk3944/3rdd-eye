.class public final synthetic Lb1/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmh/a;


# direct methods
.method public synthetic constructor <init>(Lmh/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb1/p;->a:Lmh/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lb1/p;->a:Lmh/a;

    invoke-static {v0}, Lb1/o$b;->a(Lmh/a;)V

    return-void
.end method
