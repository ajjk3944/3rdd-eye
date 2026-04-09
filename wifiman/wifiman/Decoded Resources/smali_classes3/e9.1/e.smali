.class public final synthetic Le9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/a;


# instance fields
.field public final synthetic a:Le9/d;

.field public final synthetic b:Le9/c$a;


# direct methods
.method public synthetic constructor <init>(Le9/d;Le9/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/e;->a:Le9/d;

    iput-object p2, p0, Le9/e;->b:Le9/c$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Le9/e;->a:Le9/d;

    iget-object v1, p0, Le9/e;->b:Le9/c$a;

    invoke-static {v0, v1}, Le9/d$e;->a(Le9/d;Le9/c$a;)V

    return-void
.end method
