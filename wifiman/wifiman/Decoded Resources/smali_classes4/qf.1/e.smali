.class public final synthetic Lqf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Lqf/a$a;


# direct methods
.method public synthetic constructor <init>(Lqf/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqf/e;->a:Lqf/a$a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lqf/e;->a:Lqf/a$a;

    check-cast p1, Landroid/webkit/WebView;

    invoke-static {v0, p1}, Lqf/d$b;->a(Lqf/a$a;Landroid/webkit/WebView;)LYg/J;

    move-result-object p1

    return-object p1
.end method
