.class public final synthetic Landroidx/appcompat/app/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF1/t$a;


# instance fields
.field public final synthetic a:Landroidx/appcompat/app/p;


# direct methods
.method public synthetic constructor <init>(Landroidx/appcompat/app/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/app/o;->a:Landroidx/appcompat/app/p;

    return-void
.end method


# virtual methods
.method public final v(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/o;->a:Landroidx/appcompat/app/p;

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/p;->k(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
