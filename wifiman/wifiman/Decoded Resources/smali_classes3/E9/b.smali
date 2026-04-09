.class public final synthetic LE9/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LE9/e;

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(LE9/e;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LE9/b;->a:LE9/e;

    iput p2, p0, LE9/b;->b:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LE9/b;->a:LE9/e;

    iget v1, p0, LE9/b;->b:F

    check-cast p1, Lo0/f;

    invoke-static {v0, v1, p1}, LE9/d;->a(LE9/e;FLo0/f;)LYg/J;

    move-result-object p1

    return-object p1
.end method
