.class public final synthetic LX7/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Landroid/app/Application;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Application;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX7/q;->a:Landroid/app/Application;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LX7/q;->a:Landroid/app/Application;

    check-cast p1, Lorg/kodein/di/DI$b;

    invoke-static {v0, p1}, LX7/u;->d(Landroid/app/Application;Lorg/kodein/di/DI$b;)LYg/J;

    move-result-object p1

    return-object p1
.end method
