.class public final synthetic LF4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF4/g;


# instance fields
.field public final synthetic a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF4/a;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(LF4/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LF4/a;->a:Ljava/lang/Object;

    invoke-static {v0, p1}, LF4/c;->b(Ljava/lang/Object;LF4/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
