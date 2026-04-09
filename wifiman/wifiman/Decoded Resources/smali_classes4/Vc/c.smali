.class public final LVc/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LUc/b;

.field private final b:Ljava/lang/String;

.field private final c:LVc/h;


# direct methods
.method public constructor <init>(LUc/b;Ljava/lang/String;LVc/h;)V
    .locals 1

    const-string v0, "xmlService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVc/c;->a:LUc/b;

    iput-object p2, p0, LVc/c;->b:Ljava/lang/String;

    iput-object p3, p0, LVc/c;->c:LVc/h;

    return-void
.end method
