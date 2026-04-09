.class public final synthetic Lr5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF4/g;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:LF4/c;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;LF4/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lr5/a;->b:LF4/c;

    return-void
.end method


# virtual methods
.method public final a(LF4/d;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lr5/a;->a:Ljava/lang/String;

    iget-object v1, p0, Lr5/a;->b:LF4/c;

    invoke-static {v0, v1, p1}, Lr5/b;->b(Ljava/lang/String;LF4/c;LF4/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
