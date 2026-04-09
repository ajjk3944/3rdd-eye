.class public final synthetic Le5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF4/g;


# instance fields
.field public final synthetic a:LF4/A;


# direct methods
.method public synthetic constructor <init>(LF4/A;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le5/b;->a:LF4/A;

    return-void
.end method


# virtual methods
.method public final a(LF4/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Le5/b;->a:LF4/A;

    invoke-static {v0, p1}, Le5/f;->d(LF4/A;LF4/d;)Le5/f;

    move-result-object p1

    return-object p1
.end method
