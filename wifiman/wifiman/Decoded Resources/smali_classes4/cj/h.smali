.class public final synthetic Lcj/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LVi/b;


# direct methods
.method public synthetic constructor <init>(LVi/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcj/h;->a:LVi/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcj/h;->a:LVi/b;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcj/i;->a(LVi/b;Ljava/util/List;)LVi/b;

    move-result-object p1

    return-object p1
.end method
