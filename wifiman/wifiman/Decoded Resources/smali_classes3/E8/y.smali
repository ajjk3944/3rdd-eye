.class public final synthetic LE8/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:Z


# direct methods
.method public synthetic constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LE8/y;->a:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, LE8/y;->a:Z

    check-cast p1, LDd/a;

    invoke-static {v0, p1}, LE8/A;->y0(ZLDd/a;)LDd/a;

    move-result-object p1

    return-object p1
.end method
