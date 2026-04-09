.class public abstract Ln0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo/z;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    sget-object v0, Ln0/g;->a:Ln0/g;

    invoke-virtual {v0}, Ln0/g;->w()Ln0/x;

    move-result-object v1

    invoke-virtual {v1}, Ln0/c;->b()I

    move-result v1

    invoke-virtual {v0}, Ln0/g;->w()Ln0/x;

    move-result-object v2

    invoke-virtual {v2}, Ln0/c;->b()I

    move-result v2

    sget-object v3, Ln0/n;->a:Ln0/n$a;

    invoke-virtual {v3}, Ln0/n$a;->b()I

    move-result v4

    shl-int/lit8 v2, v2, 0x6

    or-int/2addr v1, v2

    shl-int/lit8 v2, v4, 0xc

    or-int v4, v1, v2

    sget-object v1, Ln0/h;->g:Ln0/h$a;

    invoke-virtual {v0}, Ln0/g;->w()Ln0/x;

    move-result-object v2

    invoke-virtual {v1, v2}, Ln0/h$a;->c(Ln0/c;)Ln0/h;

    move-result-object v5

    invoke-virtual {v0}, Ln0/g;->w()Ln0/x;

    move-result-object v1

    invoke-virtual {v1}, Ln0/c;->b()I

    move-result v1

    invoke-virtual {v0}, Ln0/g;->t()Ln0/c;

    move-result-object v2

    invoke-virtual {v2}, Ln0/c;->b()I

    move-result v2

    invoke-virtual {v3}, Ln0/n$a;->b()I

    move-result v6

    shl-int/lit8 v2, v2, 0x6

    or-int/2addr v1, v2

    shl-int/lit8 v2, v6, 0xc

    or-int v6, v1, v2

    new-instance v7, Ln0/h;

    invoke-virtual {v0}, Ln0/g;->w()Ln0/x;

    move-result-object v1

    invoke-virtual {v0}, Ln0/g;->t()Ln0/c;

    move-result-object v2

    invoke-virtual {v3}, Ln0/n$a;->b()I

    move-result v8

    const/4 v9, 0x0

    invoke-direct {v7, v1, v2, v8, v9}, Ln0/h;-><init>(Ln0/c;Ln0/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Ln0/g;->t()Ln0/c;

    move-result-object v1

    invoke-virtual {v1}, Ln0/c;->b()I

    move-result v1

    invoke-virtual {v0}, Ln0/g;->w()Ln0/x;

    move-result-object v2

    invoke-virtual {v2}, Ln0/c;->b()I

    move-result v2

    invoke-virtual {v3}, Ln0/n$a;->b()I

    move-result v8

    shl-int/lit8 v2, v2, 0x6

    or-int/2addr v1, v2

    shl-int/lit8 v2, v8, 0xc

    or-int v8, v1, v2

    new-instance v1, Ln0/h;

    invoke-virtual {v0}, Ln0/g;->t()Ln0/c;

    move-result-object v2

    invoke-virtual {v0}, Ln0/g;->w()Ln0/x;

    move-result-object v0

    invoke-virtual {v3}, Ln0/n$a;->b()I

    move-result v3

    invoke-direct {v1, v2, v0, v3, v9}, Ln0/h;-><init>(Ln0/c;Ln0/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v9, v1

    invoke-static/range {v4 .. v9}, Lo/n;->c(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Lo/z;

    move-result-object v0

    sput-object v0, Ln0/i;->a:Lo/z;

    return-void
.end method

.method public static final a()Lo/z;
    .locals 1

    sget-object v0, Ln0/i;->a:Lo/z;

    return-object v0
.end method
