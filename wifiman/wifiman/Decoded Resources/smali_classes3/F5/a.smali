.class public final LF5/a;
.super LA5/e;
.source "SourceFile"


# instance fields
.field private final b:LA5/h;


# direct methods
.method constructor <init>(LA5/h;)V
    .locals 0

    invoke-direct {p0}, LA5/e;-><init>()V

    iput-object p1, p0, LF5/a;->b:LA5/h;

    return-void
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {p1}, Lf/d;->a(Ljava/lang/Object;)V

    new-instance p1, LF5/b;

    iget-object v0, p0, LF5/a;->b:LA5/h;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LF5/b;-><init>(LA5/h;LE5/a;)V

    return-object p1
.end method
