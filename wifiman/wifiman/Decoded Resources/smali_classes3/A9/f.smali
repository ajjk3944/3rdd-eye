.class public final synthetic LA9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LY0/b;


# direct methods
.method public synthetic constructor <init>(LY0/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA9/f;->a:LY0/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LA9/f;->a:LY0/b;

    check-cast p1, LC0/B;

    invoke-static {v0, p1}, LA9/h;->c(LY0/b;LC0/B;)Landroidx/compose/ui/layout/t;

    move-result-object p1

    return-object p1
.end method
