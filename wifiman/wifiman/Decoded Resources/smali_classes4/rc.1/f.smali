.class public final synthetic Lrc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg/e;


# instance fields
.field public final synthetic a:Lrc/h;

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Lj4/a;


# direct methods
.method public synthetic constructor <init>(Lrc/h;Landroid/app/Activity;Lj4/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrc/f;->a:Lrc/h;

    iput-object p2, p0, Lrc/f;->b:Landroid/app/Activity;

    iput-object p3, p0, Lrc/f;->c:Lj4/a;

    return-void
.end method


# virtual methods
.method public final a(Lgg/c;)V
    .locals 3

    iget-object v0, p0, Lrc/f;->a:Lrc/h;

    iget-object v1, p0, Lrc/f;->b:Landroid/app/Activity;

    iget-object v2, p0, Lrc/f;->c:Lj4/a;

    invoke-static {v0, v1, v2, p1}, Lrc/h;->f(Lrc/h;Landroid/app/Activity;Lj4/a;Lgg/c;)V

    return-void
.end method
