.class final Ln8/f$a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln8/f$a$a;->a(LYg/s;)LDj/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:La8/b;


# direct methods
.method constructor <init>(La8/b;)V
    .locals 0

    iput-object p1, p0, Ln8/f$a$a$a;->a:La8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La8/a;)Ll9/a;
    .locals 2

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll9/a;

    iget-object v1, p0, Ln8/f$a$a$a;->a:La8/b;

    invoke-virtual {p1, v1}, La8/a;->a(La8/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {v0, p1}, Ll9/a;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La8/a;

    invoke-virtual {p0, p1}, Ln8/f$a$a$a;->a(La8/a;)Ll9/a;

    move-result-object p1

    return-object p1
.end method
