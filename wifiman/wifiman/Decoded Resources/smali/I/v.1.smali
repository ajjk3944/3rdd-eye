.class public abstract LI/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lmh/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LI/v$a;->a:LI/v$a;

    sput-object v0, LI/v;->a:Lmh/l;

    return-void
.end method

.method public static final a(Landroid/view/View;)LI/q;
    .locals 1

    sget-object v0, LI/v;->a:Lmh/l;

    invoke-interface {v0, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LI/q;

    return-object p0
.end method
