.class final LSd/e$B$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSd/e$B$a;->a(Ll9/a;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LSd/e$b$b;


# direct methods
.method constructor <init>(LSd/e$b$b;)V
    .locals 0

    iput-object p1, p0, LSd/e$B$a$a;->a:LSd/e$b$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LTd/a;)LSd/e$c;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LSd/e$c$a;

    iget-object v1, p0, LSd/e$B$a$a;->a:LSd/e$b$b;

    invoke-virtual {v1}, LSd/e$b$b;->a()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, LSd/e$c$a;-><init>(Ljava/lang/String;LTd/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTd/a;

    invoke-virtual {p0, p1}, LSd/e$B$a$a;->a(LTd/a;)LSd/e$c;

    move-result-object p1

    return-object p1
.end method
