.class public final LQ7/e;
.super LSj/a$a;
.source "SourceFile"


# instance fields
.field private final e:Lve/g;


# direct methods
.method public constructor <init>(Lve/g;)V
    .locals 1

    const-string/jumbo v0, "fileLog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LSj/a$a;-><init>()V

    iput-object p1, p0, LQ7/e;->e:Lve/g;

    return-void
.end method


# virtual methods
.method protected l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    const-string/jumbo v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2, p3, p4}, LSj/a$a;->l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p4, p0, LQ7/e;->e:Lve/g;

    invoke-interface {p4, p1, p2, p3}, Lve/g;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method
