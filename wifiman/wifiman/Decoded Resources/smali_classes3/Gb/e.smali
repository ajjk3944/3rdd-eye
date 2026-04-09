.class public final LGb/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lph/d;


# instance fields
.field private final a:LGb/d;

.field private final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LGb/d;Ljava/lang/String;)V
    .locals 1

    const-string/jumbo v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "key"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGb/e;->a:LGb/d;

    iput-object p2, p0, LGb/e;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LGb/e;->c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;Lth/l;Ljava/lang/Object;)V
    .locals 0

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3}, LGb/e;->d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/Object;Lth/l;)Ljava/lang/String;
    .locals 0

    const-string/jumbo p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LGb/e;->a:LGb/d;

    iget-object p2, p0, LGb/e;->b:Ljava/lang/String;

    invoke-interface {p1, p2}, LGb/d;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Object;Lth/l;Ljava/lang/String;)V
    .locals 0

    const-string/jumbo p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LGb/e;->a:LGb/d;

    iget-object p2, p0, LGb/e;->b:Ljava/lang/String;

    invoke-interface {p1, p2, p3}, LGb/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
