.class public final synthetic LK6/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/p;


# instance fields
.field public final synthetic a:LP6/h;


# direct methods
.method public synthetic constructor <init>(LP6/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK6/b0;->a:LP6/h;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LK6/b0;->a:LP6/h;

    check-cast p1, LP6/g;

    invoke-static {v0, p1}, LK6/g0;->g(LP6/h;LP6/g;)Z

    move-result p1

    return p1
.end method
