.class public final synthetic LHe/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# instance fields
.field public final synthetic a:LT/z1;


# direct methods
.method public synthetic constructor <init>(LT/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHe/y;->a:LT/z1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LHe/y;->a:LT/z1;

    check-cast p1, LY0/d;

    invoke-static {v0, p1}, LHe/v$c$a;->a(LT/z1;LY0/d;)LY0/n;

    move-result-object p1

    return-object p1
.end method
