.class public final synthetic LF4/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/a$a;


# instance fields
.field public final synthetic a:Lf5/a$a;

.field public final synthetic b:Lf5/a$a;


# direct methods
.method public synthetic constructor <init>(Lf5/a$a;Lf5/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF4/x;->a:Lf5/a$a;

    iput-object p2, p0, LF4/x;->b:Lf5/a$a;

    return-void
.end method


# virtual methods
.method public final a(Lf5/b;)V
    .locals 2

    iget-object v0, p0, LF4/x;->a:Lf5/a$a;

    iget-object v1, p0, LF4/x;->b:Lf5/a$a;

    invoke-static {v0, v1, p1}, LF4/y;->c(Lf5/a$a;Lf5/a$a;Lf5/b;)V

    return-void
.end method
